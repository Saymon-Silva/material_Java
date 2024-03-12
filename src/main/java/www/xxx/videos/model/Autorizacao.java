package www.xxx.videos.model;


import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public enum Autorizacao implements GrantedAuthority {

    GET("Get"),
    POST("Post"),
    PUT("Put"),
    DELETE("Delete"),
    PATCH("Patch");
    private String nome;

    @Override
    public String getAuthority() {
        return nome;
    }
//    public static Autorizacao
}