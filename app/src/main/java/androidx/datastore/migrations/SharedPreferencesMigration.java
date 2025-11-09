package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.core.DataMigration;
import com.google.android.gms.internal.measurement.o0OOO0;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.Oooo000;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.OooO0O0;
import o00O0Oo.o00O0O;
import o00O0Oo.o00Oo0;
import oo00o.OooO0OO;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class SharedPreferencesMigration<T> implements DataMigration<T> {
    private final Context context;
    private final Set<String> keySet;
    private final o00Oo0 migrate;
    private final String name;
    private final OooO0OO sharedPrefs$delegate;
    private final o00O0O shouldRunMigration;

    @OooO(m13471c = "androidx.datastore.migrations.SharedPreferencesMigration$1", m13472f = "SharedPreferencesMigration.android.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1 */
    public static final class C03351 extends OooOOOO implements o00O0O {
        int label;

        public C03351(o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C03351(oooO0OO);
        }

        @Override // o00O0Oo.o00O0O
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((C03351) obj, (o00O0O0O.OooO0OO) obj2);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            return Boolean.TRUE;
        }

        public final Object invoke(T t, o00O0O0O.OooO0OO oooO0OO) {
            return ((C03351) create(t, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "androidx.datastore.migrations.SharedPreferencesMigration$2", m13472f = "SharedPreferencesMigration.android.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2 */
    public static final class C03362 extends OooOOOO implements o00O0O {
        int label;

        public C03362(o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C03362(oooO0OO);
        }

        @Override // o00O0Oo.o00O0O
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((C03362) obj, (o00O0O0O.OooO0OO) obj2);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            return Boolean.TRUE;
        }

        public final Object invoke(T t, o00O0O0O.OooO0OO oooO0OO) {
            return ((C03362) create(t, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "androidx.datastore.migrations.SharedPreferencesMigration$3", m13472f = "SharedPreferencesMigration.android.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3 */
    public static final class C03373 extends OooOOOO implements o00O0O {
        int label;

        public C03373(o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C03373(oooO0OO);
        }

        @Override // o00O0Oo.o00O0O
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((C03373) obj, (o00O0O0O.OooO0OO) obj2);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            return Boolean.TRUE;
        }

        public final Object invoke(T t, o00O0O0O.OooO0OO oooO0OO) {
            return ((C03373) create(t, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$4 */
    public static final class C03384 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $sharedPreferencesName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03384(Context context, String str) {
            super(0);
            this.$context = context;
            this.$sharedPreferencesName = str;
        }

        @Override // o00O0Oo.OooO0O0
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.$context.getSharedPreferences(this.$sharedPreferencesName, 0);
            kotlin.jvm.internal.OooOo.OooO0Oo(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        public static final boolean deleteSharedPreferences(Context context, String name) {
            kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
            kotlin.jvm.internal.OooOo.OooO0o0(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    @OooO(m13471c = "androidx.datastore.migrations.SharedPreferencesMigration", m13472f = "SharedPreferencesMigration.android.kt", m13473l = {151}, m13474m = "shouldMigrate")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 */
    public static final class C03391 extends o00O0OO0.OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedPreferencesMigration<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03391(SharedPreferencesMigration<T> sharedPreferencesMigration, o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
            this.this$0 = sharedPreferencesMigration;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.shouldMigrate(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String sharedPreferencesName, Set<String> keysToMigrate, o00Oo0 migrate) {
        this(context, sharedPreferencesName, keysToMigrate, null, migrate, 8, null);
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(sharedPreferencesName, "sharedPreferencesName");
        kotlin.jvm.internal.OooOo.OooO0o0(keysToMigrate, "keysToMigrate");
        kotlin.jvm.internal.OooOo.OooO0o0(migrate, "migrate");
    }

    private final void deleteSharedPreferences(Context context, String str) {
        Api24Impl.deleteSharedPreferences(context, str);
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs$delegate.getValue();
    }

    private final File getSharedPrefsBackup(File file) {
        return new File(file.getPath() + ".bak");
    }

    private final File getSharedPrefsFile(Context context, String str) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), OooO0oO.OooOo.OooOoo0(str, ".xml"));
    }

    @Override // androidx.datastore.core.DataMigration
    public Object cleanUp(o00O0O0O.OooO0OO oooO0OO) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = getSharedPrefs().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (getSharedPrefs().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            deleteSharedPreferences(context, str);
        }
        Set<String> set2 = this.keySet;
        if (set2 != null) {
            set2.clear();
        }
        return OooOo.f33195OooO00o;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object migrate(T t, o00O0O0O.OooO0OO oooO0OO) {
        return this.migrate.invoke(new SharedPreferencesView(getSharedPrefs(), this.keySet), t, oooO0OO);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.datastore.core.DataMigration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object shouldMigrate(T r5, o00O0O0O.OooO0OO r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.migrations.SharedPreferencesMigration.C03391
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = (androidx.datastore.migrations.SharedPreferencesMigration.C03391) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = new androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            androidx.datastore.migrations.SharedPreferencesMigration r5 = (androidx.datastore.migrations.SharedPreferencesMigration) r5
            o00O0.o000OOo.OooOO0O(r6)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            o00O0.o000OOo.OooOO0O(r6)
            o00O0Oo.o00O0O r6 = r4.shouldRunMigration
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4f
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L4f:
            java.util.Set<java.lang.String> r6 = r5.keySet
            r0 = 0
            if (r6 != 0) goto L6a
            android.content.SharedPreferences r5 = r5.getSharedPrefs()
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            kotlin.jvm.internal.OooOo.OooO0Oo(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L68
            goto L8b
        L68:
            r3 = r0
            goto L8b
        L6a:
            android.content.SharedPreferences r5 = r5.getSharedPrefs()
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L75
            goto L68
        L75:
            java.util.Iterator r6 = r6.iterator()
        L79:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L79
        L8b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.SharedPreferencesMigration.shouldMigrate(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String sharedPreferencesName, o00Oo0 migrate) {
        this(context, sharedPreferencesName, null, null, migrate, 12, null);
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(sharedPreferencesName, "sharedPreferencesName");
        kotlin.jvm.internal.OooOo.OooO0o0(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(OooO0O0 produceSharedPreferences, Set<String> keysToMigrate, o00Oo0 migrate) {
        this(produceSharedPreferences, keysToMigrate, (o00O0O) null, migrate, 4, (OooOO0O) null);
        kotlin.jvm.internal.OooOo.OooO0o0(produceSharedPreferences, "produceSharedPreferences");
        kotlin.jvm.internal.OooOo.OooO0o0(keysToMigrate, "keysToMigrate");
        kotlin.jvm.internal.OooOo.OooO0o0(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(OooO0O0 produceSharedPreferences, o00Oo0 migrate) {
        this(produceSharedPreferences, (Set) null, (o00O0O) null, migrate, 6, (OooOO0O) null);
        kotlin.jvm.internal.OooOo.OooO0o0(produceSharedPreferences, "produceSharedPreferences");
        kotlin.jvm.internal.OooOo.OooO0o0(migrate, "migrate");
    }

    private SharedPreferencesMigration(OooO0O0 oooO0O0, Set<String> set, o00O0O o00o0o, o00Oo0 o00oo0, Context context, String str) {
        this.shouldRunMigration = o00o0o;
        this.migrate = o00oo0;
        this.context = context;
        this.name = str;
        this.sharedPrefs$delegate = o0OOO0.OooO0oo(oooO0O0);
        this.keySet = set == SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() ? null : o00O0.OooOo00.Oooo0oO(set);
    }

    public /* synthetic */ SharedPreferencesMigration(OooO0O0 oooO0O0, Set set, o00O0O o00o0o, o00Oo0 o00oo0, Context context, String str, int i, OooOO0O oooOO0O) {
        this(oooO0O0, (Set<String>) set, (i & 4) != 0 ? new C03351(null) : o00o0o, o00oo0, context, str);
    }

    public /* synthetic */ SharedPreferencesMigration(OooO0O0 oooO0O0, Set set, o00O0O o00o0o, o00Oo0 o00oo0, int i, OooOO0O oooOO0O) {
        this(oooO0O0, (Set<String>) ((i & 2) != 0 ? SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() : set), (i & 4) != 0 ? new C03362(null) : o00o0o, o00oo0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(OooO0O0 produceSharedPreferences, Set<String> keysToMigrate, o00O0O shouldRunMigration, o00Oo0 migrate) {
        this(produceSharedPreferences, keysToMigrate, shouldRunMigration, migrate, (Context) null, (String) null);
        kotlin.jvm.internal.OooOo.OooO0o0(produceSharedPreferences, "produceSharedPreferences");
        kotlin.jvm.internal.OooOo.OooO0o0(keysToMigrate, "keysToMigrate");
        kotlin.jvm.internal.OooOo.OooO0o0(shouldRunMigration, "shouldRunMigration");
        kotlin.jvm.internal.OooOo.OooO0o0(migrate, "migrate");
    }

    public /* synthetic */ SharedPreferencesMigration(Context context, String str, Set set, o00O0O o00o0o, o00Oo0 o00oo0, int i, OooOO0O oooOO0O) {
        this(context, str, (i & 4) != 0 ? SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() : set, (i & 8) != 0 ? new C03373(null) : o00o0o, o00oo0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String sharedPreferencesName, Set<String> keysToMigrate, o00O0O shouldRunMigration, o00Oo0 migrate) {
        this(new C03384(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(sharedPreferencesName, "sharedPreferencesName");
        kotlin.jvm.internal.OooOo.OooO0o0(keysToMigrate, "keysToMigrate");
        kotlin.jvm.internal.OooOo.OooO0o0(shouldRunMigration, "shouldRunMigration");
        kotlin.jvm.internal.OooOo.OooO0o0(migrate, "migrate");
    }
}
