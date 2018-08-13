package boot;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;

import com.opencsv.bean.CsvToBeanBuilder;

import dao.TransferenciaDao;
import models.Transferencia;
import util.JPAUtil;

public class Main {
	
	public static void main(String[] args) {
		
		TransferenciaDao dao = new TransferenciaDao();
//		dao.commit();
		try {
			
			
			List<Transferencia> gastosJan = new CsvToBeanBuilder(new FileReader("C:\\Users\\André\\Documents\\Desenvolvimento\\TCC\\201801_Transferencias.csv"))
					.withType(Transferencia.class).withSeparator(';').withSkipLines(1).build().parse();
			/*List<Transferencia> gastosFev = new CsvToBeanBuilder(new FileReader("C:\\Users\\André\\Documents\\Desenvolvimento\\TCC\\201802_Transferencias.csv"))
					.withType(Transferencia.class).withSeparator(';').withSkipLines(1).build().parse();
			List<Transferencia> gastosMar = new CsvToBeanBuilder(new FileReader("C:\\Users\\André\\Documents\\Desenvolvimento\\TCC\\201803_Transferencias.csv"))
					.withType(Transferencia.class).withSeparator(';').withSkipLines(1).build().parse();
			List<Transferencia> gastosAbr = new CsvToBeanBuilder(new FileReader("C:\\Users\\André\\Documents\\Desenvolvimento\\TCC\\201804_Transferencias.csv"))
					.withType(Transferencia.class).withSeparator(';').withSkipLines(1).build().parse();
			List<Transferencia> gastosMai = new CsvToBeanBuilder(new FileReader("C:\\Users\\André\\Documents\\Desenvolvimento\\TCC\\201805_Transferencias.csv"))
					.withType(Transferencia.class).withSeparator(';').withSkipLines(1).build().parse();
			List<Transferencia> gastosJun = new CsvToBeanBuilder(new FileReader("C:\\Users\\André\\Documents\\Desenvolvimento\\TCC\\201806_Transferencias.csv"))
					.withType(Transferencia.class).withSeparator(';').withSkipLines(1).build().parse();
			List<Transferencia> gastosJul = new CsvToBeanBuilder(new FileReader("C:\\Users\\André\\Documents\\Desenvolvimento\\TCC\\201807_Transferencias.csv"))
					.withType(Transferencia.class).withSeparator(';').withSkipLines(1).build().parse();
			List<Transferencia> gastosAgo = new CsvToBeanBuilder(new FileReader("C:\\Users\\André\\Documents\\Desenvolvimento\\TCC\\201808_Transferencias.csv"))
					.withType(Transferencia.class).withSeparator(';').withSkipLines(1).build().parse();*/
			
			gastosJan.forEach(g -> dao.save(g));
			
			dao.commit();
			System.out.println("FIM");
			System.exit(1);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
