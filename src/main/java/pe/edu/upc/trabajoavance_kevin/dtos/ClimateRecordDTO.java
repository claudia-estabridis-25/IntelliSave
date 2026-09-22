package pe.edu.upc.trabajoavance_kevin.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ClimateRecordDTO {
    private Long idClimate;

    @NotNull(message = "La sede es obligatoria")
    private Long idSite;

    @NotNull(message = "La fecha y hora son obligatorias")
    private LocalDateTime climateDateTime;

    @NotNull(message = "La temperatura es obligatoria")
    private BigDecimal temperature;

    @NotNull(message = "La humedad es obligatoria")
    private BigDecimal humidity;

    @NotBlank(message = "La condicion climatica es obligatoria")
    @Size(max = 100)
    private String climateCondition;

    private BigDecimal windSpeed;
    private BigDecimal thermalSensation;

    public Long getIdClimate() { return idClimate; }
    public void setIdClimate(Long idClimate) { this.idClimate = idClimate; }
    public Long getIdSite() { return idSite; }
    public void setIdSite(Long idSite) { this.idSite = idSite; }
    public LocalDateTime getClimateDateTime() { return climateDateTime; }
    public void setClimateDateTime(LocalDateTime climateDateTime) { this.climateDateTime = climateDateTime; }
    public BigDecimal getTemperature() { return temperature; }
    public void setTemperature(BigDecimal temperature) { this.temperature = temperature; }
    public BigDecimal getHumidity() { return humidity; }
    public void setHumidity(BigDecimal humidity) { this.humidity = humidity; }
    public String getClimateCondition() { return climateCondition; }
    public void setClimateCondition(String climateCondition) { this.climateCondition = climateCondition; }
    public BigDecimal getWindSpeed() { return windSpeed; }
    public void setWindSpeed(BigDecimal windSpeed) { this.windSpeed = windSpeed; }
    public BigDecimal getThermalSensation() { return thermalSensation; }
    public void setThermalSensation(BigDecimal thermalSensation) { this.thermalSensation = thermalSensation; }
}
