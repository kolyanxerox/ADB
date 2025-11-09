package androidx.datastore.core;

import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.Oooo000;
import oo00o.OooOo;

@OooO(m13471c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", m13472f = "DataMigrationInitializer.kt", m13473l = {45}, m13474m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends OooOOOO implements Oooo000 {
    final /* synthetic */ DataMigration<T> $migration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2$1$1(DataMigration<T> dataMigration, OooO0OO oooO0OO) {
        super(1, oooO0OO);
        this.$migration = dataMigration;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(OooO0OO oooO0OO) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.$migration, oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            DataMigration<T> dataMigration = this.$migration;
            this.label = 1;
            if (dataMigration.cleanUp(this) == oooOo00) {
                return oooOo00;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
        }
        return OooOo.f33195OooO00o;
    }

    @Override // o00O0Oo.Oooo000
    public final Object invoke(OooO0OO oooO0OO) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create(oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
