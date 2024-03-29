/*
 * xnat-mrd-plugin:
 * XNAT http://www.xnat.org
 * Copyright (c) 2022, Physikalisch-Technische Bundesanstalt
 * All Rights Reserved
 *
 * Released under Apache 2.0
 */

package org.nrg.xnat.mrd;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.MrdMrdscandataBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "mrdPlugin", name = "XNAT 1.8 ISMRMRD plugin",
            dataModels = {@XnatDataModel(value = MrdMrdscandataBean.SCHEMA_ELEMENT_NAME,
                                         singular = "MR raw data",
                                         plural = "MR raw data",
                                         code = "ISMRMRD")})
public class MrdXnatPlugin {
}
