package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import java.io.IOException;
import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooO0OO;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public final class ReplaceFileCorruptionHandler<T> implements CorruptionHandler<T> {
    private final Oooo000 produceNewData;

    public ReplaceFileCorruptionHandler(Oooo000 produceNewData) {
        OooOo.OooO0o0(produceNewData, "produceNewData");
        this.produceNewData = produceNewData;
    }

    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(CorruptionException corruptionException, OooO0OO oooO0OO) throws IOException {
        return this.produceNewData.invoke(corruptionException);
    }
}
