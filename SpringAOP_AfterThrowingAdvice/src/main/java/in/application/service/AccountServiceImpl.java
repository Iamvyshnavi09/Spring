package in.application.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Service;

import in.application.modal.Account;

@Service  
public class AccountServiceImpl implements AccountService   
{  

private static Map<String,Account> map = null;  
static  
{  
map = new HashMap<>();  
 
map.put("VYS859", new Account("104411", "Saving Account"));  
map.put("KS9582", new Account("108638", "Current Account"));  
}  
@Override  
public Account getAccountByCustomerId(String customerId) throws Exception  
{  
if(customerId ==null)  
{  
throw new Exception("Invalid! Customer Id");  
}  
Account account= null;  
Set<Entry<String, Account>> entrySet = map.entrySet();  
for (Entry<String, Account> entry : entrySet)   
{  
if(entry.getKey().equals(customerId))  
{  
account= entry.getValue();  
}  
}  
return account;  
}  
}