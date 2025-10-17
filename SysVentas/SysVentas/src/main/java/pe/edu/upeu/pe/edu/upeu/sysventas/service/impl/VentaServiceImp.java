package pe.edu.upeu.pe.edu.upeu.sysventas.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.pe.edu.upeu.sysventas.model.Venta;
import pe.edu.upeu.pe.edu.upeu.sysventas.repository.ICrudGenericRepository;
import pe.edu.upeu.pe.edu.upeu.sysventas.repository.VentaRepository;
import pe.edu.upeu.pe.edu.upeu.sysventas.service.IVentaService;

@RequiredArgsConstructor
@Service
public class VentaServiceImp extends CrudGenericServiceImp<Venta, Long> implements IVentaService {

    private final VentaRepository ventaRepository;
    @Autowired
    private DataSource dataSource;


    @Override
    protected ICrudGenericRepository<Venta, Long> getRepo() {
        return ventaRepository;
    }
}
