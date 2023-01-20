public class OracleImplementor implements IDBImplementor{
    @Override
    public void execute(String sql) {
        System.out.println("oracle işletildi." + sql);
    }

    @Override
    public void openConnection(String sql) {
        System.out.println("oracle  connection açıldı." + sql);
    }
}
