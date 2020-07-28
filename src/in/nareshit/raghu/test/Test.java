package in.nareshit.raghu.test;

import in.nareshit.raghu.JpaRepository;
import in.nareshit.raghu.JpaRepositoryFactory;
/**
 * @author RAGHU
 */
public class Test {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("unchecked")
		JpaRepository<Product> je = (JpaRepository<Product>) 
		JpaRepositoryFactory.getBean(ProductRepository.class);
		je.save(new Product());
	}
}
