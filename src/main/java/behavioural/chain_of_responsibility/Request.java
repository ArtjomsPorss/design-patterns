package behavioural.chain_of_responsibility;

import lombok.Data;

@Data
public class Request {
    private String ip;
    private AuthenticationTypes authenticationType;
    private String requestData;

}
