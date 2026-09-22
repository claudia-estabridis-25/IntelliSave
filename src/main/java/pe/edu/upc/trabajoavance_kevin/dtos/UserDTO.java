package pe.edu.upc.trabajoavance_kevin.dtos;

import jakarta.validation.constraints.*;

public class UserDTO {
    private Long idUser;

    @NotNull(message = "El area es obligatoria")
    private Long idArea;

    @NotNull(message = "El rol es obligatorio")
    private Long idRole;

    @NotBlank(message = "El puesto es obligatorio")
    @Size(max = 50)
    private String position;

    @NotBlank(message = "El documento es obligatorio")
    @Size(max = 20)
    private String documentNumber;

    @NotBlank(message = "El primer nombre es obligatorio")
    @Size(max = 50)
    private String firstName;

    @Size(max = 50)
    private String secondName;

    @NotBlank(message = "El apellido paterno es obligatorio")
    @Size(max = 50)
    private String paternalLastName;

    @NotBlank(message = "El apellido materno es obligatorio")
    @Size(max = 50)
    private String maternalLastName;

    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "El correo no es valido")
    @Size(max = 100)
    private String email;

    @NotBlank(message = "La contrasena es obligatoria")
    @Size(max = 200)
    private String password;

    @Size(max = 20)
    private String phone;

    @NotNull(message = "El estado es obligatorio")
    private Boolean status;

    public Long getIdUser() { return idUser; }
    public void setIdUser(Long idUser) { this.idUser = idUser; }
    public Long getIdArea() { return idArea; }
    public void setIdArea(Long idArea) { this.idArea = idArea; }
    public Long getIdRole() { return idRole; }
    public void setIdRole(Long idRole) { this.idRole = idRole; }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public String getDocumentNumber() { return documentNumber; }
    public void setDocumentNumber(String documentNumber) { this.documentNumber = documentNumber; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getSecondName() { return secondName; }
    public void setSecondName(String secondName) { this.secondName = secondName; }
    public String getPaternalLastName() { return paternalLastName; }
    public void setPaternalLastName(String paternalLastName) { this.paternalLastName = paternalLastName; }
    public String getMaternalLastName() { return maternalLastName; }
    public void setMaternalLastName(String maternalLastName) { this.maternalLastName = maternalLastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }
}
