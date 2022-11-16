package de.bcxp.challenge;

public class weather {
    private String Day;
    private double MxT;
    private double MnT;
    private double AvT;
    private double AvDP;
    private double HrP;
    private double TPcpn;
    private double PDir;
    private double AvSp;
    private double Dir;
    private double MxS;
    private double SkyC;
    private double MxR;
    private double Mn;
    private double R_AvSLP;

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public double getMxT() {
        return MxT;
    }

    public void setMxT(double mxT) {
        MxT = mxT;
    }

    public double getMnT() {
        return MnT;
    }

    public void setMnT(double mnT) {
        MnT = mnT;
    }

    public double getAvT() {
        return AvT;
    }

    public void setAvT(double avT) {
        AvT = avT;
    }

    public double getAvDP() {
        return AvDP;
    }

    public void setAvDP(double avDP) {
        AvDP = avDP;
    }

    public double getHrP() {
        return HrP;
    }

    public void setHrP(double hrP) {
        HrP = hrP;
    }

    public double getTPcpn() {
        return TPcpn;
    }

    public void setTPcpn(double TPcpn) {
        this.TPcpn = TPcpn;
    }

    public double getPDir() {
        return PDir;
    }

    public void setPDir(double PDir) {
        this.PDir = PDir;
    }

    public double getAvSp() {
        return AvSp;
    }

    public void setAvSp(double avSp) {
        AvSp = avSp;
    }

    public double getDir() {
        return Dir;
    }

    public void setDir(double dir) {
        Dir = dir;
    }

    public double getMxS() {
        return MxS;
    }

    public void setMxS(double mxS) {
        MxS = mxS;
    }

    public double getSkyC() {
        return SkyC;
    }

    public void setSkyC(double skyC) {
        SkyC = skyC;
    }

    public double getMxR() {
        return MxR;
    }

    public void setMxR(double mxR) {
        MxR = mxR;
    }

    public double getMn() {
        return Mn;
    }

    public void setMn(double mn) {
        Mn = mn;
    }

    public double getR_AvSLP() {
        return R_AvSLP;
    }

    public void setR_AvSLP(double r_AvSLP) {
        R_AvSLP = r_AvSLP;
    }

    @Override
    public String toString() {
        return "weather{" +
                "Day='" + Day + '\'' +
                ", MxT=" + MxT +
                ", MnT=" + MnT +
                /*
                ", AvT=" + AvT +
                ", AvDP=" + AvDP +
                ", HrP=" + HrP +
                ", TPcpn=" + TPcpn +
                ", PDir=" + PDir +
                ", AvSp=" + AvSp +
                ", Dir=" + Dir +
                ", MxS=" + MxS +
                ", SkyC=" + SkyC +
                ", MxR=" + MxR +
                ", Mn=" + Mn +
                ", R_AvSLP=" + R_AvSLP +
                */
                '}';
    }
}
