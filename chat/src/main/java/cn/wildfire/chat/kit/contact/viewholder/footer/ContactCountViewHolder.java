package cn.wildfire.chat.kit.contact.viewholder.footer;

import android.view.View;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import butterknife.Bind;
import butterknife.ButterKnife;
import cn.wildfire.chat.kit.annotation.LayoutRes;
import cn.wildfire.chat.kit.contact.ContactAdapter;
import cn.wildfire.chat.kit.contact.model.ContactCountFooterValue;
import cn.wildfirechat.chat.R;

@LayoutRes(resId = R.layout.contact_item_footer)
public class ContactCountViewHolder extends FooterViewHolder<ContactCountFooterValue> {
    @Bind(R.id.countTextView)
    TextView countTextView;
    private ContactAdapter adapter;

    public ContactCountViewHolder(Fragment fragment, ContactAdapter adapter, View itemView) {
        super(fragment, adapter, itemView);
        this.adapter = adapter;
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void onBind(ContactCountFooterValue contactCountFooterValue) {
        int count = adapter.getContactCount();
        if (count == 0) {
            countTextView.setText("没有联系人");
        } else {
            countTextView.setText(count + "位联系人");
        }
    }
}