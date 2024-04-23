package tech.ada.spring.formulapi.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MRData {

    private String xmlns;
    private String series;
    private String url;
    private String limit;
    private String offset;
    private String total;
    private @JsonProperty("DriverTable") DriverTable DriverTable;

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public tech.ada.spring.formulapi.Models.DriverTable getDriverTable() {
        return DriverTable;
    }

    public void setDriverTable(tech.ada.spring.formulapi.Models.DriverTable driverTable) {
        DriverTable = driverTable;
    }
}
