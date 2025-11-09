package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0ooo.o0OoOoOo;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class PreferenceDataStore implements DataStore<Preferences> {
    private final DataStore<Preferences> delegate;

    @OooO(m13471c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", m13472f = "PreferenceDataStoreFactory.kt", m13473l = {94}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.preferences.core.PreferenceDataStore$updateData$2 */
    public static final class C03462 extends OooOOOO implements o00O0O {
        final /* synthetic */ o00O0O $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03462(o00O0O o00o0o, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$transform = o00o0o;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C03462 c03462 = new C03462(this.$transform, oooO0OO);
            c03462.L$0 = obj;
            return c03462;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(Preferences preferences, OooO0OO oooO0OO) {
            return ((C03462) create(preferences, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                Preferences preferences = (Preferences) this.L$0;
                o00O0O o00o0o = this.$transform;
                this.label = 1;
                obj = o00o0o.invoke(preferences, this);
                if (obj == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            Preferences preferences2 = (Preferences) obj;
            kotlin.jvm.internal.OooOo.OooO0OO(preferences2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((MutablePreferences) preferences2).freeze$datastore_preferences_core();
            return preferences2;
        }
    }

    public PreferenceDataStore(DataStore<Preferences> delegate) {
        kotlin.jvm.internal.OooOo.OooO0o0(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.DataStore
    public o0OoOoOo getData() {
        return this.delegate.getData();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(o00O0O o00o0o, OooO0OO oooO0OO) {
        return this.delegate.updateData(new C03462(o00o0o, null), oooO0OO);
    }
}
