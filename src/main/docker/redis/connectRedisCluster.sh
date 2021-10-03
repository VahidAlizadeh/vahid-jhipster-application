#!/usr/bin/env bash

function log {
    echo "[$(date)]: $*"
}

log "Start Redis Cluster builder"
sleep 5

log "Connect all Redis containers"
redis-cli \
    --cluster-replicas 1 \
    --cluster-yes \
    --cluster create \
        $(host vahidjhipsterapplication-redis|awk '{print $4}'):6379 \
        $(host vahidjhipsterapplication-redis-1|awk '{print $4}'):6379 \
        $(host vahidjhipsterapplication-redis-2|awk '{print $4}'):6379 \
        $(host vahidjhipsterapplication-redis-3|awk '{print $4}'):6379 \
        $(host vahidjhipsterapplication-redis-4|awk '{print $4}'):6379 \
        $(host vahidjhipsterapplication-redis-5|awk '{print $4}'):6379
