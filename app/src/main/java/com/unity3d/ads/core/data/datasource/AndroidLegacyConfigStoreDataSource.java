package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public final class AndroidLegacyConfigStoreDataSource implements ByteStringDataSource {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_CONFIGURATION_STORE = "configuration.store";
    private final StorageManager storageManager;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidLegacyConfigStoreDataSource(StorageManager storageManager) {
        OooOo.OooO0o0(storageManager, "storageManager");
        this.storageManager = storageManager;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object get(OooO0OO oooO0OO) {
        Object objOooO0O0;
        Object obj = this.storageManager.getStorage(StorageManager.StorageType.PRIVATE).get(KEY_CONFIGURATION_STORE);
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            try {
                objOooO0O0 = ProtobufExtensionsKt.fromBase64(str, true);
            } catch (Throwable th) {
                objOooO0O0 = o000OOo.OooO0O0(th);
            }
        } else {
            objOooO0O0 = null;
        }
        ByteString EMPTY = (ByteString) (objOooO0O0 instanceof oo00o.OooOO0O ? null : objOooO0O0);
        ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
        ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        ByteStringStoreKt.Dsl dsl_create = companion._create(builderNewBuilder);
        if (EMPTY == null) {
            EMPTY = ByteString.EMPTY;
            OooOo.OooO0Oo(EMPTY, "EMPTY");
        }
        dsl_create.setData(EMPTY);
        return dsl_create._build();
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object set(ByteString byteString, OooO0OO oooO0OO) {
        Storage storage = this.storageManager.getStorage(StorageManager.StorageType.PRIVATE);
        storage.set(KEY_CONFIGURATION_STORE, ProtobufExtensionsKt.toBase64(byteString, true));
        storage.writeStorage();
        return oo00o.OooOo.f33195OooO00o;
    }
}
