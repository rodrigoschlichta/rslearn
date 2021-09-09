package com.bootcamp.rslearn.observers;

import com.bootcamp.rslearn.entities.Deliver;

public interface DeliverRevisionObserver {
	
	void onSaveRevision(Deliver deliver);

}
