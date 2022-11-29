package rocks.zipcode.io.assessment4.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK ("SCISSOR"),
    PAPER ("ROCK"),
    SCISSOR("PAPER");

    private final String sign;

    RockPaperScissorHandSign(String sign){
        this.sign = sign;
    }

    public RockPaperScissorHandSign getWinner() {
        String sign = getLoser().sign;
        return RockPaperScissorHandSign.valueOf(sign);
    }

    public RockPaperScissorHandSign getLoser() {

        return RockPaperScissorHandSign.valueOf(sign);
    }
}
