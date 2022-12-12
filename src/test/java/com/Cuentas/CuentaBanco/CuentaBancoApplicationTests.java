package com.Cuentas.CuentaBanco;


import com.Cuentas.CuentaBanco.model.Ahorros;
import com.Cuentas.CuentaBanco.service.AhorrosService;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CuentaBancoApplicationTests {

	@Test
	public void contextLoads() {
            
            Ahorros ahorros = new Ahorros();
            ahorros.setNumCuenta("132132");
            ahorros.setNombre("Diego");
            ahorros.setCedula("132326");
            ahorros.setSaldoInicial(123);
            ahorros.setInteres(5);
            
            AhorrosService ahorrosService = mock(AhorrosService.class);
            
            when(ahorrosService.findAll()).thenReturn(Arrays.asList(ahorros));
            assertNotNull(ahorrosService.findAll());
        }

        
      /*  @Test
		public void happyPathScenario(){
			Customer sampleCustomer = new Customer();
			sampleCustomer.setFirstName("Susan");
			sampleCustomer.setLastName("Ivanova");
		
			EntityManager entityManager = mock(EntityManager.class);
			when(entityManager.find(Customer.class,1L)).thenReturn(sampleCustomer);
		
			CustomerReader customerReader = new CustomerReader();
			customerReader.setEntityManager(entityManager);
		
			String fullName = customerReader.findFullName(1L);
			assertEquals("Susan Ivanova",fullName);
		}*/
}
