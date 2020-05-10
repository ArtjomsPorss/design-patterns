package behavioural.chain_of_responsibility;

import lombok.Data;
import lombok.NonNull;

@Data
public class Request {
    @NonNull
    private String ip;
    @NonNull
    private AuthenticationTypes authenticationType;
    @NonNull
    private String requestData;

}
