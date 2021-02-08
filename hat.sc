//将手上的物品带到头上
//by W-Nana


__config() -> (
   m(
      l('stay_loaded','true')
   )
);



__command() -> (
   slot = query(player(),'selected_slot');

   item = inventory_get(player(),slot);
   head = inventory_get(player(),39);
     
   item_name = item:0;
   item_count = item:1;
   item_nbt = item:2;
  
   head_name = head:0;
   head_count = head:1;
   head_nbt = head:2;


   inventory_set(player(),slot,head_count,head_name,head_nbt);
   inventory_set(player(),39,item_count,item_name,item_nbt);

   null
)

