package capstone_design_1.ssmps_backend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddStoreRequest {
    private String name;
    private String address;
}
