package in.nareshit.raghu;

/**
 * @author RAGHU
 */
public class SimpleJpaRepository<T> implements JpaRepository<T> {

	@Override
	public void save(T ob) {
		System.out.println("SAVING :"+ob.getClass().getName());
	}

}
