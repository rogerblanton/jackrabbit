/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jackrabbit.test.config;

import org.apache.jackrabbit.core.config.PersistenceManagerConfig;
import org.apache.jackrabbit.core.persistence.bundle.DerbyPersistenceManager;
import org.apache.jackrabbit.test.config.util.PrettyPrinter;
import org.apache.jackrabbit.test.config.util.Variables;
import org.apache.jackrabbit.test.config.xml.ConfException;

public class PersistenceManagerConf extends BeanConf {

	public PersistenceManagerConf(BeanConf beanConf) {
		super(beanConf);
	}

	/**
	 * Uses {@link DerbyPersistenceManager} (bundle) by default.
	 */
	public PersistenceManagerConf() {
		this.className = DerbyPersistenceManager.class.getName();
	}

	public PersistenceManagerConfig createPersistenceManagerConfig(Variables variables) throws ConfException {
		return new PersistenceManagerConfig(super.createBeanConfig(variables));
	}

	public void print(PrettyPrinter pp) {
		pp.printlnIndent("[PersistenceManager");
		
		printBeanConf(pp);
		
		pp.printlnIndent("]");
	}

}
