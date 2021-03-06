package plus.ldl.model.user.pojos;

import lombok.Data;

/**
 * @author ldl
 */
@Data
public class ApUser {
    private Long id;
    private String salt;
    private String name;
    private String password;
    private String phone;
    private String image;
    private Boolean sex;
    private Boolean isCertification;
    private Boolean isIdentityAuthentication;
    private Boolean status;
    private int flag;
}
