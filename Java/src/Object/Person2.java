package Object;

import java.io.Serializable;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@EqualsAndHashCode
public class Person2 implements Serializable{
	private String name;
	private String phoneNumber;
}
