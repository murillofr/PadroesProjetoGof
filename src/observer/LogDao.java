package observer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LogDao {
	
	public void salvarLog(Log log) throws Exception {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/dbArquivo","root","");
		Class.forName("com.mysql.jdbc.Driver");
		PreparedStatement ps = c.prepareStatement("insert into tb_log(ds_tipo,ds_titulo,ds_valor values (?,?,?)");
		ps.setString(1, log.getTipo());
		ps.setString(2, log.getTitulo());
		ps.setString(3, log.getValor());
		ps.execute();
	}

}
