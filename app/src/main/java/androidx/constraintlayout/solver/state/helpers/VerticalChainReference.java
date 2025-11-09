package androidx.constraintlayout.solver.state.helpers;

import androidx.constraintlayout.solver.state.ConstraintReference;
import androidx.constraintlayout.solver.state.State;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class VerticalChainReference extends ChainReference {
    private Object mBottomToBottom;
    private Object mBottomToTop;
    private Object mTopToBottom;
    private Object mTopToTop;

    /* renamed from: androidx.constraintlayout.solver.state.helpers.VerticalChainReference$1 */
    public static /* synthetic */ class C01761 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$state$State$Chain;

        static {
            int[] iArr = new int[State.Chain.values().length];
            $SwitchMap$androidx$constraintlayout$solver$state$State$Chain = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$state$State$Chain[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$state$State$Chain[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VerticalChainReference(State state) {
        super(state, State.Helper.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.solver.state.HelperReference
    public void apply() {
        ArrayList<Object> arrayList = this.mReferences;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            this.mState.constraints(obj).clearVertical();
        }
        ArrayList<Object> arrayList2 = this.mReferences;
        int size2 = arrayList2.size();
        ConstraintReference constraintReference = null;
        int i2 = 0;
        ConstraintReference constraintReference2 = null;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ConstraintReference constraintReferenceConstraints = this.mState.constraints(obj2);
            if (constraintReference2 == null) {
                Object obj3 = this.mTopToTop;
                if (obj3 != null) {
                    constraintReferenceConstraints.topToTop(obj3);
                } else {
                    Object obj4 = this.mTopToBottom;
                    if (obj4 != null) {
                        constraintReferenceConstraints.topToBottom(obj4);
                    } else {
                        constraintReferenceConstraints.topToTop(State.PARENT);
                    }
                }
                constraintReference2 = constraintReferenceConstraints;
            }
            if (constraintReference != null) {
                constraintReference.bottomToTop(constraintReferenceConstraints.getKey());
                constraintReferenceConstraints.topToBottom(constraintReference.getKey());
            }
            constraintReference = constraintReferenceConstraints;
        }
        if (constraintReference != null) {
            Object obj5 = this.mBottomToTop;
            if (obj5 != null) {
                constraintReference.bottomToTop(obj5);
            } else {
                Object obj6 = this.mBottomToBottom;
                if (obj6 != null) {
                    constraintReference.bottomToBottom(obj6);
                } else {
                    constraintReference.bottomToBottom(State.PARENT);
                }
            }
        }
        if (constraintReference2 != null) {
            float f = this.mBias;
            if (f != 0.5f) {
                constraintReference2.verticalBias(f);
            }
        }
        int i3 = C01761.$SwitchMap$androidx$constraintlayout$solver$state$State$Chain[this.mStyle.ordinal()];
        if (i3 == 1) {
            constraintReference2.setVerticalChainStyle(0);
        } else if (i3 == 2) {
            constraintReference2.setVerticalChainStyle(1);
        } else {
            if (i3 != 3) {
                return;
            }
            constraintReference2.setVerticalChainStyle(2);
        }
    }

    public void bottomToBottom(Object obj) {
        this.mBottomToBottom = obj;
    }

    public void bottomToTop(Object obj) {
        this.mBottomToTop = obj;
    }

    public void topToBottom(Object obj) {
        this.mTopToBottom = obj;
    }

    public void topToTop(Object obj) {
        this.mTopToTop = obj;
    }
}
