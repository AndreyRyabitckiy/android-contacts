package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback <T extends ListDiffInterface> extends DiffUtil.ItemCallback<T> {





    @Override
    public boolean areItemsTheSame(T oldItem, T newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
        public boolean areContentsTheSame(T oldItem, T newItem) {
            return oldItem.equals(newItem);
        }


        @Override
        public T getChangePayload(T oldItem, T newItem) {
            return newItem;
        }

}
