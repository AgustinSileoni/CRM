package com.agustin.CRM.mapper;

import com.agustin.CRM.dto.Regimen_fiscalResponseDTO;
import com.agustin.CRM.model.Regimen_fiscal;

public class Regimen_fiscalMapper {

    public static Regimen_fiscalResponseDTO toDTO(Regimen_fiscal regimenFiscal){
        Regimen_fiscalResponseDTO regimenFiscalDTO = new Regimen_fiscalResponseDTO();

        regimenFiscalDTO.setRegimen_fiscal_id(regimenFiscal.getRegimen_fiscal_id().toString());
        regimenFiscalDTO.setNombre(regimenFiscal.getNombre());
        regimenFiscalDTO.setTipo_factura(regimenFiscal.getTipo_factura());
        return  regimenFiscalDTO;


    }

}
