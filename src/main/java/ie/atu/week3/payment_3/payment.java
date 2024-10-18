package ie.atu.week3.payment_3;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class payment {
    @Valid
    @NotNull(message = "Method should not be left blank, You should choose between Cash or Card")
    private String method;
    private String type;
}
