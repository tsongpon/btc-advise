package dev.songpon.btcadvise.service;

import dev.songpon.btcadvise.domain.Advise;

public interface AdviserService {
    Advise getAdvise(String baseCoin);
}
