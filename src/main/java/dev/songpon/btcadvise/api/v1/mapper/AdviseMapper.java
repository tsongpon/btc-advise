package dev.songpon.btcadvise.api.v1.mapper;

import dev.songpon.btcadvise.api.v1.response.AdviseResponse;
import dev.songpon.btcadvise.domain.Advise;

public class AdviseMapper {
    public static AdviseResponse mapResponse(Advise advise) {
        return new AdviseResponse(advise.getBaseCoin(), advise.getGuide(), advise.getExchangeRate());
    }
}
