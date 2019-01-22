package comble.compa.comparable;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class Compar implements Comparable<Compar>{
	@NonNull
	public String name;
	@NonNull
	public int age;
	public int compareTo(Compar o) {
		return this.age-o.age;
	}
	
}
