package com.emc.mongoose.storage.driver.atmos;

import com.emc.mongoose.api.common.exception.OmgShootMyFootException;
import com.emc.mongoose.api.model.data.DataInput;
import com.emc.mongoose.api.model.io.task.IoTask;
import com.emc.mongoose.api.model.item.Item;
import com.emc.mongoose.storage.driver.base.StorageDriverFactory;
import com.emc.mongoose.ui.config.load.LoadConfig;
import com.emc.mongoose.ui.config.storage.StorageConfig;

public class AtmosStorageDriverFactory<
	I extends Item, O extends IoTask<I>, T extends AtmosStorageDriver<I, O>
>
implements StorageDriverFactory<I, O, T> {

	private static final String NAME = "atmos";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public T create(
		final String stepId, final DataInput dataInput, final LoadConfig loadConfig,
		final StorageConfig storageConfig, final boolean verifyFlag
	) throws OmgShootMyFootException, InterruptedException {
		return (T) new AtmosStorageDriver<>(
			stepId, dataInput, loadConfig, storageConfig, verifyFlag
		);
	}
}

