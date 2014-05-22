/**
 * Copyright Plugtree LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 package com.plugtree.solrmeter.mock;

import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.response.UpdateResponse;

import com.plugtree.solrmeter.model.OptimizeStatistic;
import com.plugtree.solrmeter.model.QueryStatistic;
import com.plugtree.solrmeter.model.UpdateStatistic;
import com.plugtree.solrmeter.model.exception.CommitException;
import com.plugtree.solrmeter.model.exception.OptimizeException;
import com.plugtree.solrmeter.model.exception.QueryException;
import com.plugtree.solrmeter.model.exception.UpdateException;
/**
 * 
 * @author tflobbe
 *
 */
public class MockStatistic implements UpdateStatistic, QueryStatistic,
		OptimizeStatistic {

	@Override
	public void onAddError(UpdateException exception) {
	}

	@Override
	public void onAddedDocument(UpdateResponse response) {
	}

	@Override
	public void onCommit(UpdateResponse response) {
	}

	@Override
	public void onCommitError(CommitException exception) {
	}

	@Override
	public void onFinishedTest() {
	}

	@Override
	public void onExecutedQuery(QueryResponse response, long clientTime) {
	}

	@Override
	public void onQueryError(QueryException exception) {
	}

	@Override
	public void onOptimizeError(OptimizeException exception) {
	}

	@Override
	public void onOptimizeFinished(long delay) {
	}

	@Override
	public void onOptimizeStared(long initTime) {
	}

}
