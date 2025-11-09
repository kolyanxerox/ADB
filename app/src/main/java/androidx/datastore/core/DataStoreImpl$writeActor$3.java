package androidx.datastore.core;

import androidx.datastore.core.Message;
import com.ironsource.InterfaceC3173h3;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import oo00o.OooOo;

@OooO(m13471c = "androidx.datastore.core.DataStoreImpl$writeActor$3", m13472f = "DataStoreImpl.kt", m13473l = {InterfaceC3173h3.c.b.f8816h}, m13474m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DataStoreImpl$writeActor$3 extends OooOOOO implements o00O0O {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeActor$3(DataStoreImpl<T> dataStoreImpl, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = dataStoreImpl;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        DataStoreImpl$writeActor$3 dataStoreImpl$writeActor$3 = new DataStoreImpl$writeActor$3(this.this$0, oooO0OO);
        dataStoreImpl$writeActor$3.L$0 = obj;
        return dataStoreImpl$writeActor$3;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Message.Update<T> update, OooO0OO oooO0OO) {
        return ((DataStoreImpl$writeActor$3) create(update, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            Message.Update update = (Message.Update) this.L$0;
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.label = 1;
            if (dataStoreImpl.handleUpdate(update, this) == oooOo00) {
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
}
