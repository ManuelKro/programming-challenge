package de.bcxp.challenge;

public class Countries {
        private String name;
        private String capital;
        private String Accession;
        private double Population;
        private double Area;
        private Integer GDP;
        private double HDI;
        private Integer MEPs;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCapital() {
            return capital;
        }

        public void setCapital(String capital) {
            this.capital = capital;
        }

        public String getAccession() {
            return Accession;
        }

        public void setAccession(String accession) {
            Accession = accession;
        }

        public double getPopulation() {
            return Population;
        }

        public void setPopulation(double population) {
            Population = population;
        }

        public double getArea() {
            return Area;
        }

        public void setArea(double area) {
            Area = area;
        }

        public Integer getGDP() {
            return GDP;
        }

        public void setGDP(Integer GDP) {
            this.GDP = GDP;
        }

        public double getHDI() {
            return HDI;
        }

        public void setHDI(double HDI) {
            this.HDI = HDI;
        }

        public Integer getMEPs() {
            return MEPs;
        }

        public void setMEPs(Integer MEPs) {
            this.MEPs = MEPs;
        }

    @Override
    public String toString() {
        return "Countries{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", Accession='" + Accession + '\'' +
                ", Population=" + Population +
                ", Area=" + Area +
                ", GDP=" + GDP +
                ", HDI=" + HDI +
                ", MEPs=" + MEPs +
                '}';
    }
}
