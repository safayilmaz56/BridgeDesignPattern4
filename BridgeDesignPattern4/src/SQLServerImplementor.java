public class SQLServerImplementor implements IDBImplementor{
    @Override
    public void execute(String sql) {
        System.out.println("sql server işletildi." + sql);
    }

    @Override
    public void openConnection(String sql) {
        System.out.println("sql server connection açıldı." + sql);
    }
}
