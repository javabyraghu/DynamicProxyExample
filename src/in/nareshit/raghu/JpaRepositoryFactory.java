package in.nareshit.raghu;
/**
 * @author RAGHU
 */
public class JpaRepositoryFactory {

	private JpaRepository<?> getInstance(Class<?>[] clz) throws Exception {
		@SuppressWarnings("deprecation")
		JpaRepository<?> ob = (JpaRepository<?>)
		ProcessProxyGenerator
		.newInstance(
				Class.forName(SimpleJpaRepository.class.getName()).newInstance(),
				clz);
		return ob;
	}

	public static JpaRepository<?>  getBean(Class<?> c) throws Exception {
		return new  JpaRepositoryFactory().getInstance(new Class[] {c});
	}
}
