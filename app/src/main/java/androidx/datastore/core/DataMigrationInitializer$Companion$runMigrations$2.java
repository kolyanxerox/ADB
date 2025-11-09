package androidx.datastore.core;

import java.util.List;
import o00O0O0O.OooO0OO;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import oo00o.OooOo;

@OooO(m13471c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", m13472f = "DataMigrationInitializer.kt", m13473l = {44, 46}, m13474m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DataMigrationInitializer$Companion$runMigrations$2 extends OooOOOO implements o00O0O {
    final /* synthetic */ List<Oooo000> $cleanUps;
    final /* synthetic */ List<DataMigration<T>> $migrations;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataMigrationInitializer$Companion$runMigrations$2(List<? extends DataMigration<T>> list, List<Oooo000> list2, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.$migrations, this.$cleanUps, oooO0OO);
        dataMigrationInitializer$Companion$runMigrations$2.L$0 = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @Override // o00O0Oo.o00O0O
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((DataMigrationInitializer$Companion$runMigrations$2) obj, (OooO0OO) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a A[RETURN] */
    @Override // o00O0OO0.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r1 = r9.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r9.L$0
            java.util.List r4 = (java.util.List) r4
            o00O0.o000OOo.OooOO0O(r10)
            goto L42
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            java.lang.Object r1 = r9.L$3
            java.lang.Object r4 = r9.L$2
            androidx.datastore.core.DataMigration r4 = (androidx.datastore.core.DataMigration) r4
            java.lang.Object r5 = r9.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r9.L$0
            java.util.List r6 = (java.util.List) r6
            o00O0.o000OOo.OooOO0O(r10)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L64
        L35:
            o00O0.o000OOo.OooOO0O(r10)
            java.lang.Object r10 = r9.L$0
            java.util.List<androidx.datastore.core.DataMigration<T>> r1 = r9.$migrations
            java.util.List<o00O0Oo.Oooo000> r4 = r9.$cleanUps
            java.util.Iterator r1 = r1.iterator()
        L42:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L8a
            java.lang.Object r5 = r1.next()
            androidx.datastore.core.DataMigration r5 = (androidx.datastore.core.DataMigration) r5
            r9.L$0 = r4
            r9.L$1 = r1
            r9.L$2 = r5
            r9.L$3 = r10
            r9.label = r3
            java.lang.Object r6 = r5.shouldMigrate(r10, r9)
            if (r6 != r0) goto L5f
            goto L85
        L5f:
            r8 = r1
            r1 = r10
            r10 = r6
            r6 = r5
            r5 = r8
        L64:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L88
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r10 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r7 = 0
            r10.<init>(r6, r7)
            r4.add(r10)
            r9.L$0 = r4
            r9.L$1 = r5
            r9.L$2 = r7
            r9.L$3 = r7
            r9.label = r2
            java.lang.Object r10 = r6.migrate(r1, r9)
            if (r10 != r0) goto L86
        L85:
            return r0
        L86:
            r1 = r5
            goto L42
        L88:
            r10 = r1
            goto L86
        L8a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(T t, OooO0OO oooO0OO) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(t, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
