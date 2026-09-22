package pe.edu.upc.trabajoavance_kevin.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class RoleDTO {
    private Long idRole;

    @NotBlank(message = "El nombre del rol es obligatorio")
    @Size(max = 50)
    private String roleName;

    @Size(max = 150)
    private String roleDescription;

    public Long getIdRole() { return idRole; }
    public void setIdRole(Long idRole) { this.idRole = idRole; }
    public String getRoleName() { return roleName; }
    public void setRoleName(String roleName) { this.roleName = roleName; }
    public String getRoleDescription() { return roleDescription; }
    public void setRoleDescription(String roleDescription) { this.roleDescription = roleDescription; }
}
