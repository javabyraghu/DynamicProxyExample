package in.nareshit.raghu;

/**
 * @author RAGHU
 */
public interface JpaRepository<T> {

	void save(T ob);
}
