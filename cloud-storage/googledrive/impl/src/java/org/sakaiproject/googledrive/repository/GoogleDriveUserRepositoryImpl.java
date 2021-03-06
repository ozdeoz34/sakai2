/**
 * Copyright (c) 2003-2019 The Apereo Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *             http://opensource.org/licenses/ecl2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sakaiproject.googledrive.repository;

import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;
import org.sakaiproject.serialization.BasicSerializableRepository;

import org.sakaiproject.googledrive.model.GoogleDriveUser;

/**
 * Created by bgarcia
 */
@Transactional(readOnly = true)
public class GoogleDriveUserRepositoryImpl extends BasicSerializableRepository<GoogleDriveUser, String> implements GoogleDriveUserRepository {

	@Override
	public GoogleDriveUser findBySakaiId(String sakaiId){
		return (GoogleDriveUser) startCriteriaQuery().add(Restrictions.eq("sakaiUserId", sakaiId)).uniqueResult();
	}

}
