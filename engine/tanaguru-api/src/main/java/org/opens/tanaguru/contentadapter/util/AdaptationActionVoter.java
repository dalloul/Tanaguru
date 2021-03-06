/*
 *  Tanaguru - Automated webpage assessment
 *  Copyright (C) 2008-2014  Open-S Company
 * 
 *  This file is part of Tanaguru.
 * 
 *  Tanaguru is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 * 
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 *  Contact us by mail: open-s AT open-s DOT com
 */
package org.opens.tanaguru.contentadapter.util;

import java.util.Collection;
import org.opens.tanaguru.entity.audit.Audit;
import org.opens.tanaguru.entity.service.parameterization.ParameterDataService;

/**
 *
 * @author jkowalczyk
 */
public interface AdaptationActionVoter {

    /**
     * 
     * @param audit
     * @return whether the current caller has to be executed regarding the given
     * audit
     */
    boolean doesExecute(Audit audit);

    /**
     * 
     * @param parameterDataService 
     */
    void setParameterDataService(ParameterDataService parameterDataService);
    
    /**
     * 
     * @param authorizedValues 
     */
    void setAuthorizedValues (Collection<String> authorizedValues);
}