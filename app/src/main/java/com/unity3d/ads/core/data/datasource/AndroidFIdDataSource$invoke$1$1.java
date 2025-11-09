package com.unity3d.ads.core.data.datasource;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;

@OooO(m13471c = "com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1", m13472f = "AndroidFIdDataSource.kt", m13473l = {19}, m13474m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AndroidFIdDataSource$invoke$1$1 extends OooOOOO implements o00O0O {
    final /* synthetic */ Task<String> $task;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFIdDataSource$invoke$1$1(Task<String> task, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$task = task;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new AndroidFIdDataSource$invoke$1$1(this.$task, oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            return obj;
        }
        o000OOo.OooOO0O(obj);
        Task<String> task = this.$task;
        this.L$0 = task;
        this.label = 1;
        final o00O0O0O.OooOOOO oooOOOO = new o00O0O0O.OooOOOO(Oooo0o0.OooO.OooOOOO(this));
        final AndroidFIdDataSource$invoke$1$1$1$1 androidFIdDataSource$invoke$1$1$1$1 = new AndroidFIdDataSource$invoke$1$1$1$1(oooOOOO);
        task.addOnSuccessListener(new OnSuccessListener(androidFIdDataSource$invoke$1$1$1$1) { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$sam$com_google_android_gms_tasks_OnSuccessListener$0
            private final /* synthetic */ Oooo000 function;

            {
                OooOo.OooO0o0(androidFIdDataSource$invoke$1$1$1$1, "function");
                this.function = androidFIdDataSource$invoke$1$1$1$1;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final /* synthetic */ void onSuccess(Object obj2) {
                this.function.invoke(obj2);
            }
        });
        task.addOnFailureListener(new OnFailureListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                OooOo.OooO0o0(it, "it");
                oooOOOO.resumeWith(o000OOo.OooO0O0(it));
            }
        });
        Object objOooO00o = oooOOOO.OooO00o();
        return objOooO00o == oooOo00 ? oooOo00 : objOooO00o;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((AndroidFIdDataSource$invoke$1$1) create(o000oo2, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }
}
