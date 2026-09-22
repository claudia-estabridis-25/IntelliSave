# User / Role / Climate Record - English naming

This version keeps the same Spring Boot structure but changes class, table, endpoint and attribute names to English.

## Main entities
- Role
- User
- ClimateRecord

## Field mapping

### Role
- idRol -> idRole
- nombreRol -> roleName
- descripcionRol -> roleDescription

### User
- idUsuario -> idUser
- idArea -> idArea
- idRol -> idRole
- puesto -> position
- DNI -> documentNumber
- primerNombre -> firstName
- segundoNombre -> secondName
- apellidoPaterno -> paternalLastName
- apellidoMaterno -> maternalLastName
- correoUsuario -> email
- contrasenaUsuario -> password
- telefonoUsuario -> phone
- estadoUsuario -> status

### ClimateRecord
- idClima -> idClimate
- idSede -> idSite
- fechaHoraClima -> climateDateTime
- temperatura -> temperature
- humedad -> humidity
- condicionClima -> climateCondition
- velocidadViento -> windSpeed
- sensacionTermica -> thermalSensation
