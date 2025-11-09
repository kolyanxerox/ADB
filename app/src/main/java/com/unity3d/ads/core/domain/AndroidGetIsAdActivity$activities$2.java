package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;
import o00OOOoO.o0000O0;

/* loaded from: classes3.dex */
public final class AndroidGetIsAdActivity$activities$2 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ AndroidGetIsAdActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetIsAdActivity$activities$2(AndroidGetIsAdActivity androidGetIsAdActivity) {
        super(0);
        this.this$0 = androidGetIsAdActivity;
    }

    @Override // o00O0Oo.OooO0O0
    public final List<o0000O0> invoke() {
        List<ByteString> observableAndroidActivitiesList = this.this$0.sessionRepository.getNativeConfiguration().getObservableAndroidActivitiesList();
        OooOo.OooO0Oo(observableAndroidActivitiesList, "sessionRepository.native…ableAndroidActivitiesList");
        ArrayList arrayList = new ArrayList(o00O0.Oooo000.OooOo0(observableAndroidActivitiesList, 10));
        Iterator<T> it = observableAndroidActivitiesList.iterator();
        while (it.hasNext()) {
            byte[] byteArray = ((ByteString) it.next()).toByteArray();
            arrayList.add(o0000O0.OooOOO0(Arrays.copyOf(byteArray, byteArray.length)));
        }
        return arrayList;
    }
}
