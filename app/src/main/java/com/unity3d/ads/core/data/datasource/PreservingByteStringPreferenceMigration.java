package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public final class PreservingByteStringPreferenceMigration implements DataMigration<ByteStringStoreOuterClass.ByteStringStore> {
    private final Context context;
    private final GetByteStringData getByteStringData;
    private final String key;
    private final String name;

    public PreservingByteStringPreferenceMigration(Context context, String name, String key, GetByteStringData getByteStringData) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(name, "name");
        OooOo.OooO0o0(key, "key");
        OooOo.OooO0o0(getByteStringData, "getByteStringData");
        this.context = context;
        this.name = name;
        this.key = key;
        this.getByteStringData = getByteStringData;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object cleanUp(OooO0OO oooO0OO) {
        return oo00o.OooOo.f33195OooO00o;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object migrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, OooO0OO oooO0OO) {
        String string;
        if (!byteStringStore.getData().isEmpty() || (string = this.context.getSharedPreferences(this.name, 0).getString(this.key, null)) == null || string.length() == 0) {
            return byteStringStore;
        }
        ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(this.getByteStringData.invoke(string)).build();
        OooOo.OooO0Oo(byteStringStoreBuild, "newBuilder()\n           …                 .build()");
        return byteStringStoreBuild;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object shouldMigrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, OooO0OO oooO0OO) {
        return Boolean.valueOf(byteStringStore.getData().isEmpty());
    }
}
