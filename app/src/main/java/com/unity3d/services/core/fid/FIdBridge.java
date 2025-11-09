package com.unity3d.services.core.fid;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.jvm.internal.OooOo;
import o00O0.o0O0O00;
import oo00o.OooOO0;

/* loaded from: classes3.dex */
public final class FIdBridge extends GenericBridge {
    private final Object instance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FIdBridge(Object instance) {
        super(o0O0O00.OooOOOo(new OooOO0(Constants.GET_APP_INSTANCE_ID, new Class[0])), false);
        OooOo.OooO0o0(instance, "instance");
        this.instance = instance;
    }

    public final Task<String> getAppInstanceId() {
        Task<String> task = (Task) callNonVoidMethod(Constants.GET_APP_INSTANCE_ID, this.instance, new Object[0]);
        if (task != null) {
            return task;
        }
        Task<String> taskForResult = Tasks.forResult(null);
        OooOo.OooO0Oo(taskForResult, "forResult(null)");
        return taskForResult;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return Constants.Companion.getClassName();
    }
}
