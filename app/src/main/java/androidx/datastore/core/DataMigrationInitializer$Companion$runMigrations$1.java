package androidx.datastore.core;

import androidx.datastore.core.DataMigrationInitializer;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;

@OooO(m13471c = "androidx.datastore.core.DataMigrationInitializer$Companion", m13472f = "DataMigrationInitializer.kt", m13473l = {42, 57}, m13474m = "runMigrations")
/* loaded from: classes.dex */
public final class DataMigrationInitializer$Companion$runMigrations$1<T> extends OooO0OO {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataMigrationInitializer.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$1(DataMigrationInitializer.Companion companion, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.this$0 = companion;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runMigrations(null, null, this);
    }
}
